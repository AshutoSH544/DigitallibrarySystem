# Digital Library Book Management System

## Overview
The **Digital Library Book Management System** is a simple Java-based application that allows librarians to efficiently **add, update, search, and remove books** while maintaining their availability status. This is a **console-based** application developed using Java.

## Features
- **Add a Book**: Accepts Book ID, Title, Author, Genre, and Availability Status.
- **View All Books**: Displays a list of all books with their details.
- **Search Book by ID or Title**: Allows searching for a book using its ID or title.
- **Update Book Details**: Modifies book details such as availability status, title, or author.
- **Delete a Book Record**: Removes a book from the catalog.
- **Exit System**: Provides an option to close the program.

## Constraints
- **Book ID must be unique**.
- **Title and Author must be non-empty strings**.
- **Availability Status must be either 'Available' or 'Checked Out'**.

## Technologies Used
- **Java** (JDK 11+ recommended)
- **Eclipse IDE** (or any Java IDE)
- **Collections Framework** (ArrayList for storing books)

## Installation & Setup
### Prerequisites
Ensure you have:
- Java installed (`java -version` to check).
- Eclipse IDE or any Java IDE.

### Steps to Run
1. **Clone the Repository**
   ```sh
   git clone <repository-link>
   cd DigitalLibrarySystem
   ```
2. **Open in Eclipse**
   - Open **Eclipse IDE**.
   - Go to **File > Open Projects from File System**.
   - Select the project folder and click **Finish**.

3. **Run the Application**
   - Open `Main.java`.
   - Click **Run** or use `Ctrl + F11`.
   - Interact with the menu in the console.

## Usage
### Example Commands
#### Adding a Book:
```
Enter Book ID: 101
Enter Title: Java Programming
Enter Author: Ashutosh Kumar
Enter Genre: Programming
Enter Availability Status (Available/Checked Out): Available
Book added successfully!
```

#### Viewing All Books:
```
Book ID: 101
Title: Java Programming
Author: Ashutosh Kumar
Genre: Programming
Status: Available
--------------------------
```

## Challenges Faced & Future Improvements
### Challenges
- Handling user input validation.
- Implementing a search function efficiently.
- Ensuring the uniqueness of Book IDs.

### Future Enhancements
- Implement **database integration** (MySQL/SQLite) instead of in-memory storage.
- Develop a **GUI version** using JavaFX.
- Implement **user authentication** for role-based access.
- Add **borrowing & return tracking** for books.

## Contributing
If you would like to contribute:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m "Added new feature"`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a Pull Request.

## License
This project is open-source and available under the **MIT License**.

## Author
**Ashutosh Kumar**

