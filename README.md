# GOALS!

Desktop-based sales information system

# REQUIREMENT

What am I using for create this simple apps ?!
- [NetBeans 8.2](https://netbeans.org/) for text editor
- [JDK 1.8](https://www.oracle.com/technetwork/java/javase/downloads/index.html) for running java
- [MySQL Community Server 8.0.13](https://dev.mysql.com/downloads/mysql/) for databases
- [MySQL Connector/J 8.0.13](https://dev.mysql.com/downloads/connector/j/) for connection apps with databases
- [iReport 5.6.0](https://community.jaspersoft.com/project/ireport-designer) for report design
- [Install Creator 2](https://www.clickteam.com/install-creator-2) for .exe

# FEATURES

- Sales
- Inventory
- Consignment
- Report
- Return
- User Management

# USAGE

## Development
- Turn on MySQL Server
- Create databases and some table
- Then, clone this repo
    ```
    git clone https://github.com/tikusdugem/desktop-sales.git
    ```
- Open the projects with a NetBeans

## Create Installer
- Open Install Creator Pro
- Follow the instructions
- Then, select the .jar file. In my case on the *dist/DNetHouse.jar*
- Create .exe

## Production
- Turn on MySQL Server
- Double click DNetHouse.exe installer

# NOTES!
- Maybe after you open the project that will some error. Mostly some error because missing the library or link to library
- Version. I create this a long time ago so maybe some version need to downgrade