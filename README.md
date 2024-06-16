# Pharmacy Express Delivery System

## Project Introduction

Implemented online medicine purchasing for users and real-time delivery for pharmacy merchants using technologies such as Spring Boot/vue.js/MySQL/Redis.

## Features

### Admin Portal
1. **Employee Login/Logout**: Manage employee authentication.
2. **Employee Information Management**: Handle employee data.
3. **Category Management**: Organize and manage different categories.
4. **Medication Management**: Oversee and manage medications.
5. **Package Management**: Handle package configurations.
6. **Order Management**: Process and manage orders.
7. **Data Statistics**: Generate and view statistical data.
8. **Order Alerts**: Receive notifications for new orders.

### User Portal
1. **WeChat Login**: User authentication through WeChat.
2. **Recipient Address Management**: Manage delivery addresses.
3. **User Order History**: View past orders.
4. **Medication Dosage Inquiry**: Check medication dosages.
5. **Shopping Cart**: Add and manage items in the shopping cart.
6. **Place Order**: Complete and submit orders.
7. **Payment**: Process payments.
8. **Category and Medication Browsing**: Browse through categories and medications.



## Environment Setup

### Frontend Environment Setup
The frontend is developed using Vue.js with Nginx as the proxy server. To start the Nginx service, simply double-click `./frontend/nginx.exe`. The service will be available on port 80.

### Backend Environment Setup
1. **sky-take-out**: A Maven parent project for dependency management and aggregation of submodules.
2. **sky-common**: A submodule for storing common classes, such as utilities, constants, and exceptions.
3. **sky-pojo**: A submodule for storing entity classes, Value Objects (VO), Data Transfer Objects (DTO), etc.
4. **sky-server**: A submodule for backend services, including configuration files, controllers, services, and mappers.

### Database Environment Setup
Create the database by running `./database/sky.sql`.