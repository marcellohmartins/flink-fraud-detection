# Simple Fraud Detection

Simple Flink project based on the [Flink Docs](https://nightlies.apache.org/flink/flink-docs-release-1.17/docs/try-flink/datastream/)

## Prerequisites

Before getting started, ensure that you have the following requirements met:

- Windows operating system (or mention your specific operating system)
- Java Development Kit (JDK) installed (versions 8, 11, or 15)
- Apache Maven (MVN) installed

If you haven't installed the JDK and Maven, follow the instructions below:

### Installing Java Development Kit (JDK)

1. Visit the Oracle website or adopt OpenJDK to download the desired Java version (8, 11, or 15).
2. Install the JDK by following the installation instructions provided by Oracle or the OpenJDK documentation.
3. Set the `JAVA_HOME` environment variable to the installation directory of the JDK.
4. Update the `PATH` environment variable to include the JDK's `bin` directory.

### Installing Apache Maven (MVN)

1. Download Apache Maven from the official Apache Maven website.
2. Follow the installation instructions provided by Apache Maven for your operating system.
3. Set the `MVN_HOME` environment variable to the installation directory of Apache Maven.
4. Update the `PATH` environment variable to include the Maven's `bin` directory.

## Getting Started

To start using this project, follow the steps below:

1. Clone this repository to your local machine.
2. Open a command prompt or terminal.
3. Navigate to the project directory.
4. Run the following Maven command to generate the project configuration:

   ```shell
   mvn archetype:generate -DarchetypeGroupId=org.apache.flink -DarchetypeArtifactId=flink-walkthrough-datastream-java -DarchetypeVersion=1.17.1 -DgroupId=frauddetection -DartifactId=frauddetection -Dversion=0.1 -Dpackage=spendreport -DinteractiveMode=false


Make sure to execute the command in the appropriate directory.

5. Customize the generated project according to your needs.

## License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT). Please see the [LICENSE](LICENSE) file for more details.
