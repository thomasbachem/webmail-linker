# webmail-linker.js

[![License](http://img.shields.io/badge/license-MIT-blue.svg?style=flat)](LICENSE)
[![CI Status](https://sebbo.helium.uberspace.de/teamcity-badges/webmaillinkerjs_production/status)](https://ci.sebbo.net/viewType.html?buildTypeId=webmaillinkerjs_production&guest=1)
[![Code Coverage](https://sebbo.helium.uberspace.de/teamcity-badges/webmaillinkerjs_production/coverage-istanbul)](https://ci.sebbo.net/viewType.html?buildTypeId=webmaillinkerjs_production&guest=1)



### About

This is a JavaScript implementation of [Webmail Linker](https://github.com/thomasbachem/webmail-linker). It can be used as a node.js module or in a browser.



### Usage

#### node.js

##### Install

```
npm install webmail-linker
```

##### Usage

``` javascript
var webmaillinker = require('webmail-linker'),
provider = webmaillinker.getProviderByEmailAddress('hello@googlemail.com');

if(provider) {
	console.log('Check your email at %s (%s)', provider.name, provider.url);
}
```

```
Check your email at Gmail (http://gmail.com/)
```


#### Browser

##### Include

We recommend to use the awesome [jsDelivr CDN](http://www.jsdelivr.com/) to ship the latest version of webmail-linker.js to the browser:

```html
<script src="//cdn.jsdelivr.net/webmail-linker.js/0.1/webmail-linker.min.js"></script>
```

You hate CDNs? You can also [download webmail-linker.js from GitHub](https://github.com/sebbo2002/webmail-linker.js/releases).


##### Usage

```javascript
var provider = webmaillinker.getProviderByEmailAddress('hello@googlemail.com');

if(provider) {
	console.log('Check your email at %s (%s)', provider.name, provider.url);
}
```

```javascript
require(['webmail-linker'], function(webmaillinker) {
	var provider = webmaillinker.getProviderByEmailAddress('hello@googlemail.com');

	if(provider) {
		console.log('Check your email at %s (%s)', provider.name, provider.url);
	}
});
```


### API

You can find the API Documentation [here](https://github.com/sebbo2002/webmail-linker.js#api).