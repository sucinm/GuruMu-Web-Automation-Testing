$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "As a user i want to login to website sauce demo",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.before({
  "duration": 10800315292,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Normal login",
  "description": "",
  "id": "login;normal-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User open the website GuruMu",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User input \"johndoe@gmail.com\" as email and input \"pass12345\" as password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.verifyDisplay()"
});
formatter.result({
  "duration": 240353167,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\u0027email\u0027]\"}\n  (Session info: chrome\u003d109.0.5414.119)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.1.2\u0027, revision: \u00279a5a329c5a\u0027\nSystem info: host: \u0027nsystem-mbp\u0027, ip: \u0027fe80:0:0:0:1c1b:e7bd:2429:d029%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [0c8fc454893bbefa7e0344e46524f308, findElement {using\u003dxpath, value\u003d//input[@id\u003d\u0027email\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 109.0.5414.119, chrome: {chromedriverVersion: 108.0.5359.71 (1e0e3868ee06..., userDataDir: /var/folders/00/xzw63_pj58g...}, goog:chromeOptions: {debuggerAddress: localhost:50059}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), se:cdp: ws://localhost:50059/devtoo..., se:cdpVersion: 109.0.5414.119, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 0c8fc454893bbefa7e0344e46524f308\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:558)\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:382)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:374)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\n\tat com.sun.proxy.$Proxy20.isDisplayed(Unknown Source)\n\tat org.example.pageObject.LoginPage.isDisplayed(LoginPage.java:41)\n\tat step_definitions.LoginSteps.verifyDisplay(LoginSteps.java:21)\n\tat ✽.Given User open the website GuruMu(features/Login.feature:6)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "johndoe@gmail.com",
      "offset": 12
    },
    {
      "val": "pass12345",
      "offset": 51
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 566007666,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Invalid Login",
  "description": "",
  "id": "login;invalid-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "User open the website GuruMu",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User input \"\u003cemail\u003e\" as email and input \"\u003cpassword\u003e\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User see error \"\u003cerrorMessage\u003e\" on login page",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "login;invalid-login;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "errorMessage"
      ],
      "line": 14,
      "id": "login;invalid-login;;1"
    },
    {
      "cells": [
        "johndoe@gmail.com",
        "",
        "Password is required"
      ],
      "line": 15,
      "id": "login;invalid-login;;2"
    },
    {
      "cells": [
        "",
        "123",
        "Username is required"
      ],
      "line": 16,
      "id": "login;invalid-login;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8176172375,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Invalid Login",
  "description": "",
  "id": "login;invalid-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User open the website GuruMu",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User input \"johndoe@gmail.com\" as email and input \"\" as password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User see error \"Password is required\" on login page",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyDisplay()"
});
formatter.result({
  "duration": 148363333,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\u0027email\u0027]\"}\n  (Session info: chrome\u003d109.0.5414.119)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.1.2\u0027, revision: \u00279a5a329c5a\u0027\nSystem info: host: \u0027nsystem-mbp\u0027, ip: \u0027fe80:0:0:0:1c1b:e7bd:2429:d029%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [5f6c184cae2c2edcc22f04bf7ad923ae, findElement {using\u003dxpath, value\u003d//input[@id\u003d\u0027email\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 109.0.5414.119, chrome: {chromedriverVersion: 108.0.5359.71 (1e0e3868ee06..., userDataDir: /var/folders/00/xzw63_pj58g...}, goog:chromeOptions: {debuggerAddress: localhost:50079}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), se:cdp: ws://localhost:50079/devtoo..., se:cdpVersion: 109.0.5414.119, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 5f6c184cae2c2edcc22f04bf7ad923ae\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:558)\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:382)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:374)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\n\tat com.sun.proxy.$Proxy20.isDisplayed(Unknown Source)\n\tat org.example.pageObject.LoginPage.isDisplayed(LoginPage.java:41)\n\tat step_definitions.LoginSteps.verifyDisplay(LoginSteps.java:21)\n\tat ✽.Given User open the website GuruMu(features/Login.feature:10)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "johndoe@gmail.com",
      "offset": 12
    },
    {
      "val": "",
      "offset": 51
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Password is required",
      "offset": 16
    }
  ],
  "location": "LoginSteps.errorText(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 113219667,
  "status": "passed"
});
formatter.before({
  "duration": 11935479208,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Invalid Login",
  "description": "",
  "id": "login;invalid-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User open the website GuruMu",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User input \"\" as email and input \"123\" as password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User see error \"Username is required\" on login page",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyDisplay()"
});
formatter.result({
  "duration": 162214584,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\u0027email\u0027]\"}\n  (Session info: chrome\u003d109.0.5414.119)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.1.2\u0027, revision: \u00279a5a329c5a\u0027\nSystem info: host: \u0027nsystem-mbp\u0027, ip: \u0027fe80:0:0:0:1c1b:e7bd:2429:d029%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [228b0b029e79c3f08cb12f17f18b8ab2, findElement {using\u003dxpath, value\u003d//input[@id\u003d\u0027email\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 109.0.5414.119, chrome: {chromedriverVersion: 108.0.5359.71 (1e0e3868ee06..., userDataDir: /var/folders/00/xzw63_pj58g...}, goog:chromeOptions: {debuggerAddress: localhost:50096}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), se:cdp: ws://localhost:50096/devtoo..., se:cdpVersion: 109.0.5414.119, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 228b0b029e79c3f08cb12f17f18b8ab2\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:558)\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:382)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:374)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\n\tat com.sun.proxy.$Proxy20.isDisplayed(Unknown Source)\n\tat org.example.pageObject.LoginPage.isDisplayed(LoginPage.java:41)\n\tat step_definitions.LoginSteps.verifyDisplay(LoginSteps.java:21)\n\tat ✽.Given User open the website GuruMu(features/Login.feature:10)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 12
    },
    {
      "val": "123",
      "offset": 34
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Username is required",
      "offset": 16
    }
  ],
  "location": "LoginSteps.errorText(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 108846750,
  "status": "passed"
});
});