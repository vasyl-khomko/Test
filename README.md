## Play Framework - The High Velocity Web Framework

The \*Play Framework\* combines productivity and performance making it easy to build scalable web applications with Java and Scala.  Play is developer friendly with a "just hit refresh" workflow and built-in testing support.  With Play, applications scale predictably due to a stateless and non-blocking architecture.  By being <span class="info">RESTful</span> by default, including assets compilers, JSON & WebSocket support, Play is a perfect fit for modern web & mobile applications.

### Learn More

- [www.playframework.com](http://www.playframework.com)
- [Download](http://www.playframework.com/download)
- [Install](http://www.playframework.com/documentation/latest/Installing)
- [Create a new application](http://www.playframework.com/documentation/latest/NewApplication)
- [Play for Scala developers](http://www.playframework.com/documentation/latest/ScalaHome)
- [Play for Java developers](http://www.playframework.com/documentation/latest/JavaHome)
- [Build from source](http://www.playframework.com/documentation/latest/BuildingFromSource)
- [Search or create issues](https://github.com/playframework/playframework/issues)
- [Get help](http://stackoverflow.com/questions/tagged/playframework)
- [Contribute](https://www.playframework.com/contributing)

### License

This software is licensed under the Apache 2 license, quoted below.

Unless required by applicable

## [Contribute](https://www.playframework.com/contributing)

<h3>
  <a href="#home">Home</a>
</h3>

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this project except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0.

With Play, applications scale predictably due to a stateless

Unless required by applicable law or agreed to in writing, <span class="info">software distributed</span> under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

| | Contract Calculations |
| --------------------- | ----------------------------------------------------- |
| Multiplier | 1 |
| XBT Contract Value | Multiplier * Futures Price * 1 ETC |
| USD Contract Value | XBT Contract Value * XBTUSD |
| PnL Calculation | # Contracts * Multipler * (Exit Price - Entry Price) |

# PHP XML Parser

A <i>PHP XML</i> parser class that provides an easy way to convert <em>XML</em> into native PHP
arrays and back again. It has no dependencies on any external libraries or
extensions bundled with <strong>PHP</strong>. The entire parser is concisely written in <mark>PHP</mark>.

This project is actively <time>20:20</time> maintained. It is used in our production code. If you
spot an issue, <samp>please let us know through</samp> the Issues section on our <cite>Github</cite>
project page: https://github.com/revnode/xml/issues

## Why

As XML H<sub>2</sub>O becomes <sup>superscripted</sup> less popular, the need for a parser moves from constant to
infrequent. It makes little sense to keep a parser resident in memory at all times
for functionality that might be used once every few days.

For example, just to get SimpleXML going, you will need to have the libxml2
library installed on your system. You will need xml, libxml, and simplexml
extensions installed for PHP. You will need to keep all those extensions in
memory for each request.

In contrast, this simple parser is less than 500 lines of code and is only
loaded when you need it. It has no dependencies, no required libraries or
extensions, and will work on any modern PHP installation. The price you pay for
that convenience is speed. It is much slower than SimpleXML. See the benchmarking
section for details.

In short, this project makes sense for those who want to simplify their PHP
install and use, have a need for a simple XML parser, but don't much care
about speed.

## Requirements

PHP 5.4.0+

## Install

Just place the xml.php file in a convenient location and include it in your
code.

## Design Goals

* Zero dependencies on external libraries or PHP extensions.
* Provide a parser from and to the XML standard.
* Provide support for the most commonly used parts of the XML standard.
* Maintain a minimal memory footprint during operation, even for large XML files.
* Maintain a codebase that is less than 1000 lines. Currently at less than 500 lines.

## Usage

### XML String to PHP Array

```php
<?php

require 'xml.php';

$xml = new xml('<?xml version="1.0" encoding="ISO-8859-1"?>
<breakfast_menu>
	<food>
		<name>Waffles</name>
	</food>
</breakfast_menu>');
var_dump($xml->data);

?>
```

