# Multi-Threaded Merge Sort

## Overview

This project implements a multi-threaded merge sort algorithm in Java. The merge sort algorithm divides the array into two halves, each sorted by a separate thread, and then merges them back together. This approach leverages the power of multi-threading to enhance sorting performance, especially for larger datasets.

## Features

- **Multi-threading**: Utilizes Java's threading capabilities to sort different parts of the array concurrently, improving efficiency.
- **Merge Sort Algorithm**: Implements the classic merge sort algorithm, which is known for its efficiency and stability.
- **User Input**: Allows users to input a customizable size and values for the array to be sorted.
- **Dynamic Sorting**: Supports sorting of varying sizes of integer arrays based on user input.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or later
- An Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or any text editor

### Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/medkarim19/FastestMergeSort.git
   cd multi-threaded-merge-sort

2. **Compile the project**:
   ```bash
   javac Principale.java

3. **Run the project**:
    ```bash
   java Principale
