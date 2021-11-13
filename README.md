## Instructions
1. ``git clone git@github.com:joshjames279/bank-java-challenge.git`` in your chosen directory.
2. Then open the project in your chosen IDE.

## Running Tests
This project is written using Gradle and uses the JUnit5 test framework.

Run the test by right-clicking the project file and clicking `Run all tests`

## Domain Model

| Object | Messages | Properties | Context | Output |
|------|------|------|---------|--------|
| Data | Storage() | | Keeps track of the date and amount of money for the statement. | List<Object[]> |
| | | array | Array of transactions coming in. | Array of Object Arrays |
| | | dataArray | | List<Object[]> |
| Transaction | Update() | | Keeps a history of the balance for the statement. | List<`String`> |
| | | array | Array of transactions coming in. | Array of Object Arrays |
| | | balance | | Double |
| | | balanceArray | | List<`String`> |
| Bank | Statement() | | The full statement when adding the various necessary parts. | String |
| | | array | Array of transactions coming in. | Array of Object Arrays |
| | | balance | | Double |
| | | bankStatement | | String |
| | | balanceArray | | List<`String`> |
| | | dataArray | | List<Object[]> |