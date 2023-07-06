import requests
from bs4 import BeautifulSoup
import csv
from urllib.parse import urljoin

# Function to scrape product details from a given URL
def scrape_product_details(url):
    response = requests.get(url)
    soup = BeautifulSoup(response.content, 'html.parser')
    products = soup.find_all('div', {'data-component-type': 's-search-result'})

    results = []

    for product in products:
        product_url = urljoin(url, product.find('a', {'class': 'a-link-normal s-no-outline'})['href'])
        product_name = product.find('span', {'class': 'a-size-medium a-color-base a-text-normal'}).text.strip()
        product_price = product.find('span', {'class': 'a-offscreen'}).text.strip()
        rating = product.find('span', {'class': 'a-icon-alt'}).text.split()[0]
        num_reviews = product.find('span', {'class': 'a-size-base'}).text.strip()

        results.append([product_url, product_name, product_price, rating, num_reviews])

    return results

# Function to scrape additional product information from a given URL
def scrape_additional_info(url):
    response = requests.get(url)
    soup = BeautifulSoup(response.content, 'html.parser')

    asin = None
    product_description = None
    manufacturer = None

    asin_element = soup.find('span', {'class': 'a-size-base', 'data-component-type': 's-product-info-bar'})
    if asin_element:
        asin = asin_element.text.strip()

    description_element = soup.find('div', {'id': 'productDescription'})
    if description_element:
        product_description = description_element.text.strip()

    manufacturer_element = soup.find('a', {'id': 'bylineInfo'})
    if manufacturer_element:
        manufacturer = manufacturer_element.text.strip()

    return asin, product_description, manufacturer

# Scrape multiple pages of product listings
def scrape_multiple_pages(num_pages):
    all_results = []

    for page in range(1, num_pages + 1):
        url = f'https://www.amazon.in/s?k=bags&crid=2M096C61O4MLT&qid=1653308124&sprefix=ba%2Caps%2C283&ref=sr_pg_{page}'
        results = scrape_product_details(url)
        all_results.extend(results)

    return all_results

# Scrape 20 pages of product listings
data = scrape_multiple_pages(20)

# Loop through the data and scrape additional information
for index, item in enumerate(data):
    url = item[0]
    asin, product_description, manufacturer = scrape_additional_info(url)

    # Update the data with additional information
    data[index].extend([asin, product_description, manufacturer])

# Export the updated data to a CSV file
csv_file = 'product_data.csv'
header = ['Product URL', 'Product Name', 'Product Price', 'Rating', 'Number of Reviews', 'ASIN', 'Product Description', 'Manufacturer']

with open(csv_file, 'w', newline='', encoding='utf-8') as file:
    writer = csv.writer(file)
    writer.writerow(header)
    writer.writerows(data)

print(f"Scraping and exporting to '{csv_file}' complete.")
def scrape_additional_info(url):
    response = requests.get(url)
    soup = BeautifulSoup(response.content, 'html.parser')

    asin = None
    product_description = None
    manufacturer = None

    # Update the CSS selectors to match the new structure of the product details page
    asin_element = soup.find('th', string='ASIN')
    if asin_element:
        asin = asin_element.find_next('td').text.strip()

    product_description_element = soup.find('div', {'id': 'productDescription'})
    if product_description_element:
        product_description = product_description_element.text.strip()

    manufacturer_element = soup.find('a', {'id': 'bylineInfo'})
    if manufacturer_element:
        manufacturer = manufacturer_element.text.strip()

    return asin, product_description, manufacturer
