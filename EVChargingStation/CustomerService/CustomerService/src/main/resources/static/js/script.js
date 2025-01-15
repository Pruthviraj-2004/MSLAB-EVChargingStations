// Function to display all customers
function displayAllCustomers() {
    const resultDiv = document.getElementById("result");
    fetch("http://localhost:3004/customers")
        .then(response => response.json())
        .then(data => {
            let output = "<h3>All Customers:</h3><ul>";
            data.forEach(customer => {
                output += `<li>${customer.name} - ${customer.email}</li>`;
            });
            output += "</ul>";
            resultDiv.innerHTML = output;
        })
        .catch(error => {
            resultDiv.innerHTML = `<p>Error fetching customers: ${error}</p>`;
        });
}

// Function to fetch customer details by ID
function fetchCustomerDetails() {
    const customerId = prompt("Enter Customer ID to fetch details:");
    if (!customerId) return;

    const resultDiv = document.getElementById("result");
    fetch(`http://localhost:3004/customers/${customerId}`)
        .then(response => response.json())
        .then(data => {
            if (data) {
                resultDiv.innerHTML = `<h3>Customer Details:</h3><p>Name: ${data.name}</p><p>Email: ${data.email}</p>`;
            } else {
                resultDiv.innerHTML = `<p>No customer found with ID: ${customerId}</p>`;
            }
        })
        .catch(error => {
            resultDiv.innerHTML = `<p>Error fetching customer: ${error}</p>`;
        });
}

// Function to delete customer by ID
function deleteCustomer() {
    const customerId = prompt("Enter Customer ID to delete:");
    if (!customerId) return;

    const resultDiv = document.getElementById("result");
    fetch(`http://localhost:3004/customers/${customerId}`, {
        method: 'DELETE'
    })
        .then(response => {
            if (response.ok) {
                resultDiv.innerHTML = `<p>Customer with ID ${customerId} deleted successfully.</p>`;
            } else {
                resultDiv.innerHTML = `<p>Failed to delete customer with ID: ${customerId}</p>`;
            }
        })
        .catch(error => {
            resultDiv.innerHTML = `<p>Error deleting customer: ${error}</p>`;
        });
}
