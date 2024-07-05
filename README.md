# Google Android Calculator Mobile Automation Tests

This project includes automation testing scripts for a calculator application using **Appium Java Client** version 7.6.0.

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running Tests](#running-tests)

## Introduction

The goal of this project is to provide an example of how to automate tests for a calculator application using Appium with Java. The project includes various types of basic mathematical operations and validation of their results.

## Prerequisites

Before you begin, ensure that your system has:

- Java Development Kit (JDK) 11 or higher.
- Apache Maven.
- Android SDK (if testing on an emulator or Android device).
- Node.js and Appium server.
- The calculator application installed on the device/emulator.

## Installation

1. **Clone the repository:**

    ```bash
    git clone https://github.com/koswara-dev/google-android-calculator-automation-tests.git
    cd google-android-calculator-automation-tests
    ```

2. **Install dependencies:**

   Make sure you are in the project root directory and run the following command:

    ```bash
    mvn clean install
    ```

3. **Configure Appium:**

   Run the Appium server in the terminal/GUI:

    ```bash
    appium
    ```

## Running Tests

To run the tests, you can use the following Maven command:

```bash
mvn test
```

## Buy me a coffe

If you like this project and want to support its further development, buy me a coffee!

[![Buy Me a Coffee](https://www.buymeacoffee.com/assets/img/guidelines/download-assets-sm-1.svg)](https://www.buymeacoffee.com/kudajengke404)