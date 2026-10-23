# TDD reflection

I built `Calculator` and `DateChecker` by writing a failing test before each behavior. The red result showed that the new test was checking something the code did not do yet. I then wrote only enough code to make that test pass, and I committed the failing test and the passing code as separate steps.
One test changed the design. After the January test passed, `has31Days` returned true for every month. The April test failed and forced the method to tell months apart. The `@EnumSource` test then failed for the other 31-day months, so the implementation had to name all seven. The null test failed because no exception was thrown, which led to `IllegalArgumentException` instead of another boolean result. February is documented and tested as returning false.

