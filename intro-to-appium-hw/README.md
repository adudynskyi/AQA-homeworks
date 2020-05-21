# intro-to-appium-hw

This is a homework for the Intro to Appium

## IntelliJ IDEA project configuration
1. Clone this project to your local environment

    ```git clone https://github.com/kermek/intro-to-appium-hw.git```
2. Open in IntelliJ IDEA

    ```./gradlew openIdea```

3. Press `Ctrl+Alt+Shift+S` and check in your `Project Structure`
    value of `Project language level` is set to `8 - Lambdas, type annotations et.`
4. Setup env according to the slide #9 `Installation using script (preferred)`
5. Complete all TODO tasks.
6. Execute tests.

## Selenium assignment

`SampleAppTest` needs to be completed.
You task is to complete all TODOs `PageView` and `SampleAppTest`.
Add env variable `APPIUM_DRIVER=IOS` or `APPIUM_DRIVER=ANDROID` to run on different platforms.

## Unit testing
There are number of different ways to run your unit tests, e.g.:
* In test class put your cursor on its definition, right click and choose `Run ...`
* Right click on a little green triangle near the class definition and choose `Run ...`
* In test class put your cursor on its definition and press `Ctrl+Shift+F10` (`Control+Shift+R`)
* Once you executed your test you could re-run it again by pressing `Shift+F10` (`Control+R`)
* from command line ```./gradlew clean test```# intro-to-appium-hw
