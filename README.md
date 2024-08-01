## Employee Management System

This application allows you to manage employee details. You can view, update, and remove employee records.

### Features

- **View Employee**: Search and view employee details.
- **Update Employee**: Update employee details.
- **Remove Employee**: Delete employee records.

### Running the Application

1. **Download the JAR File:**
   - Navigate to the [Releases](https://github.com/Amlan-10/Employee-Management-System/releases) section of the repository.
   - Download the latest JAR file.

2. **Run the JAR File:**
   - Open a terminal or command prompt.
   - Navigate to the directory where you downloaded the JAR file.
   - Run the following command:
     ```sh
     java -jar EmployeeManagementSystem.jar
     ```

### Building the JAR File

If you want to build the JAR file yourself, follow these steps:

1. **Compile Your Java Files:**
   - Ensure all your Java files are compiled into `.class` files.

2. **Create a Manifest File:**
   - Create a `MANIFEST.MF` file that includes the main class entry point:
     ```
     Manifest-Version: 1.0
     Main-Class: employee.management.system.MainClass
     ```

3. **Package into JAR:**
   - Use the following command to create the JAR file:
     ```sh
     jar cfm EmployeeManagementSystem.jar MANIFEST.MF -C path/to/classes .
     ```

### Issues and Support

If you encounter any issues or need support, please open an issue in the [Issues](https://github.com/Amlan-10/Employee-Management-System/issues) section of the repository.

### Contact

For further information or inquiries, please contact tribediamlan@gmail.com.

