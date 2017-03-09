# CobolIntoJava
This project reads one or more files with typical data of WORKING-STORAGE-SECTION of a Cobol source file and creates the  associated JavaBean classes.

## Getting Started
 * See the _Installing_ section.
 * TODO

### Prerequisities
 * JDK 1.7+
 * Installed MAVEN

### Installing

 * Download the source code of the project form Github in your workspace
 * Set JDK to 1.7 versione
 * Put the COBOL source files into directory _cobolSource_ of _src/main/resources/_: the name of every files to parse must contains the string "input" 
 * Run _mvn clean compile package install_

## Running the tests

 * Run _mvn test_

### Break down into end to end tests
 * TODO

### And coding style tests
 * TODO

## Deployment

 * Run _mvn clean compile package_

## Built With

 * [Eclipse](http://www.eclipse.org) - IDE
 * [JUnit](https://junit.org) - Unit test.unit
 * [MAVEN](http://maven.apache.org) - Automation of build process
 * [DILLINGER](http://dillinger.io ) - MarkDown editor online 

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us: it's a good guideline.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the repository.

## Authors

 * **Alessandro Puzielli** - *Initial work* - [alepuzio](https://github.com/alepuzio)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
