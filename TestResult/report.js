$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/Homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Home page is the first page of the application",
  "description": "",
  "id": "home-page-is-the-first-page-of-the-application",
  "keyword": "Feature"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "Launch \"FireFox\" Browser and load Url",
  "rows": [
    {
      "cells": [
        "http://automationpractice.com/index.php"
      ],
      "line": 4
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "FireFox",
      "offset": 8
    }
  ],
  "location": "TC_01Registerpageauto.launchBrowser(String,DataTable)"
});
formatter.result({
  "duration": 28534363839,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should able to register using valid email address",
  "description": "",
  "id": "home-page-is-the-first-page-of-the-application;user-should-able-to-register-using-valid-email-address",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@sc1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "the page is launch check signin option and click and verify the create account header",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "enter the valid email address in create account page and click on create account button to navigate to register page",
  "rows": [
    {
      "cells": [
        "kittu12345@gmail.com"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on gender radio button",
  "rows": [
    {
      "cells": [
        "Mr"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "verify register page personal details elements First name,Lastname,Email, password,Date of Birth elements and chcekboxes",
  "rows": [
    {
      "cells": [
        "kittu",
        "sri",
        "Kittu12!"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "verify your address elements First name,Lastname, company and address",
  "rows": [
    {
      "cells": [
        "ABCD",
        "201,PO",
        "201,PO"
      ],
      "line": 15
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "verify City,State,Zip/Postal Code,Country elements",
  "rows": [
    {
      "cells": [
        "NewYork",
        "06606"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "verify Additional information,Home phone,Mobile phone,Assign an address alias for future reference elements",
  "rows": [
    {
      "cells": [
        "ABCDEF",
        "0404040000",
        "1234567890",
        "My address"
      ],
      "line": 19
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "verify the details entered in register page and click on register",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_01Registerpageauto.signing()"
});
formatter.result({
  "duration": 4820480412,
  "status": "passed"
});
formatter.match({
  "location": "TC_01Registerpageauto.entervalidemail(DataTable)"
});
formatter.result({
  "duration": 1804764835,
  "status": "passed"
});
formatter.match({
  "location": "TC_01Registerpageauto.Title(DataTable)"
});
formatter.result({
  "duration": 2891642585,
  "status": "passed"
});
formatter.match({
  "location": "TC_01Registerpageauto.getTitle(DataTable)"
});
formatter.result({
  "duration": 3508281729,
  "status": "passed"
});
formatter.match({
  "location": "TC_01Registerpageauto.Address_information(DataTable)"
});
formatter.result({
  "duration": 1289971730,
  "status": "passed"
});
formatter.match({
  "location": "TC_01Registerpageauto.postal_information(DataTable)"
});
formatter.result({
  "duration": 1614557764,
  "status": "passed"
});
formatter.match({
  "location": "TC_01Registerpageauto.Additionalinformation(DataTable)"
});
formatter.result({
  "duration": 2341634680,
  "status": "passed"
});
formatter.match({
  "location": "TC_01Registerpageauto.Registerbutton()"
});
formatter.result({
  "duration": 2831129913,
  "status": "passed"
});
});