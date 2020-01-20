$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/flipkart.feature");
formatter.feature({
  "name": "Related to flipkart HomePage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check different tabs flipkart in HomePage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dataset"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch flipkart Url",
  "keyword": "Given "
});
formatter.match({
  "location": "FlipkartTabsTest.i_launch_flipkart_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify following component",
  "rows": [
    {
      "cells": [
        "Electronics"
      ]
    },
    {
      "cells": [
        "TVs \u0026 Appliances"
      ]
    },
    {
      "cells": [
        "Men"
      ]
    },
    {
      "cells": [
        "Women"
      ]
    },
    {
      "cells": [
        "Baby \u0026 Kids"
      ]
    },
    {
      "cells": [
        "Home \u0026 Furniture"
      ]
    },
    {
      "cells": [
        "Sports,Books \u0026 More"
      ]
    },
    {
      "cells": [
        "Offer Zone"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});