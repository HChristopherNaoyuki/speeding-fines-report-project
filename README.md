# Speeding Fines Report

This Java-based program displays and analyzes the highest and lowest monthly speeding fines recorded for four cities using a two-dimensional array. It includes a tabular report of the fines, statistics, and detailed comments for clarity. The program follows the Allman style for code formatting, ensuring readability and consistency.

## Table of Contents
- [Problem Description](#problem-description)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup and Execution](#setup-and-execution)
- [Code Structure](#code-structure)
- [Example Output](#example-output)
- [Author](#author)

## Problem Description
The goal of this project is to create a Java console application that displays the three highest monthly speeding fines recorded for four different cities: Johannesburg (JHB), Durban (DBN), Cape Town (CTN), and Port Elizabeth (PE). The program will display a report with the highest and lowest speeding fines for all cities combined.

### Requirements:
- Use a two-dimensional array to store the speeding fines.
- Print a tabular report with rows representing the cities and columns representing the months.
- Calculate and display the highest and lowest speeding fines.

## Features
- **Tabular Report:** Displays speeding fines for each city and month in a table format.
- **Statistics:** Calculates and displays the highest and lowest speeding fines.
- **Allman Style:** Code is formatted in Allman style for consistency.
- **Detailed Comments:** Clear comments throughout the code to explain each step.

## Technologies Used
- **Java:** Version 8 or higher
- **IDE:** (Optional) Eclipse, IntelliJ, or any preferred Java IDE

## Setup and Execution
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/HChristopherNaoyuki/speeding-fines-report-project.git
   cd speeding-fines-report
   ```
2. **Open in Your IDE:** 
   Open the cloned folder in your preferred Java IDE (e.g., Eclipse or IntelliJ) or any text editor of your choice.
3. **Compile and Run:**
   - **Using Command Line:**
     ```bash
     javac SpeedingFinesReport.java
     java SpeedingFinesReport
     ```
   - **Using IDE:** Simply click on the "Run" button within your IDE.

## Code Structure
- **Class:** `SpeedingFinesReport`
  - **Method:** `main(String[] args)` - Entry point of the application, manages the array and displays the report.
  - **Method:** `findHighestFine(int[][] fines)` - Finds and returns the highest fine in the 2D array.
  - **Method:** `findLowestFine(int[][] fines)` - Finds and returns the lowest fine in the 2D array.

## Example Output
```
******************************
SPEDDING FINES REPORT
******************************
    JAN	  FEB	  MAR
JHB	128km	135km	139km	
DBN	155km	129km	175km	
CTN	129km	130km	185km	
PE	195km	155km	221km	
******************************
SPEEDING FINES STATISTICS
******************************
Maximum Speed Captured: 221km
Minimum Speed Captured: 128km
******************************
```
