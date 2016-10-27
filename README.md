## Play Framework - The High Velocity Web Framework

It makes little sense to keep a parser resident in memory at all times
for functionality that might be used once every few days.

The Play Framework combines productivity and performance making it easy to build scalable web applications with Java and Scala.  Play is developer friendly with a just hit refresh workflow and built-in testing support.  With Play, applications scale predictably due to a stateless and non-blocking architecture.  By being <span class="info">RESTful</span> by default, including assets compilers, JSON WebSocket support, Play is a perfect fit for modern web mobile applications.

The Play Framework combines productivity and performance making it easy to build scalable web applications with Java and Scala. Play is developer friendly with a just hit refresh workflow and built-in testing support. With Play, applications scale predictably due to a stateless and non-blocking architecture. By being <span class="info">RESTful</span> by default, including assets compilers, JSON WebSocket support, Play is a perfect fit for modern web mobile applications.

In contrast, this simple parser is less than 500 lines of code and is only
loaded when you need it.

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

<h3>
  <a href="#home">Home</a>
</h3>

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this project except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0.

With Play, applications scale predictably due to a stateless

| | Contract Calculations |
| --------------------- | ----------------------------------------------------- |
| Multiplier | 1 |
| XBT Contract Value | Multiplier * Futures Price * 1 ETC |
| USD Contract Value | XBT Contract Value * XBTUSD |
| PnL Calculation | # Contracts * Multipler * (Exit Price - Entry Price) |

# PHP XML Parser

A <i class="info">PHP XML</i> parser class that provides an easy way to convert <em>XML</em> into native PHP
arrays and back again. It has no dependencies on any external libraries or
extensions bundled with <strong>PHP</strong>. The entire parser is concisely written in <mark>PHP</mark>.

This project is actively <time>20:20</time> maintained. It is used in our production code. If you
spot an issue, <samp class="info">please let us know through</samp> the Issues section on our <cite>Github</cite>
project page: https://github.com/revnode/xml/issues

## Why

As XML H<sub>2</sub>O becomes <sup>superscripted</sup> less popular, the need for a parser moves from constant to
infrequent. It makes little sense to keep a parser resident in memory at all times
for functionality that might be used once every few days.

For example, just to get SimpleXMLgoing, you will need to have the libxml2
library installed on your system. You will need xml, <span class="info">libxml</span>, and simplexml
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

> This is a blockquote with two paragraphs. Lorem ipsum dolor sit amet,
consectetuer adipiscing elit. Aliquam hendrerit mi posuere lectus.
Vestibulum enim wisi, viverra nec, fringilla in, laoreet vitae, risus.

> Donec sit amet nisl. Aliquam semper ipsum sit amet velit. Suspendisse
id sem consectetuer libero luctus adipiscing.

You have to create a project before you can add any content that requires translation.

To create a project:

  1. [Log in]({{site.parentsite}}/login) or [sign up]({{site.parentsite}}/signup) to your Crowdin account
  2. Click **Start Project** ![]({{site.url}}/assets/docs/start_project.png)
  3. Name your project
  4. Customize your project address. It can not be changed after the project has been created.
  5. Define whether you want your project to be visible for everyone or private. If your project is public you still have an option to restrict the possibility to make translations for users until you confirm their membership. In its turn, private projects can not be found via search engines and Crowdin search. ![]({{site.url}}/assets/docs/project_visibility.png)
  6. Select the source and target languages of your project. The source language is the language you’re translating from and target languages are the ones you’re translating to. ![]({{site.url}}/assets/docs/project_langauges.png) Please note, the source language cannot be further changed. If one of your target languages is missing in the list, you can add it as a custom language later.
  7. Click **Create Project**. After this you will be navigated to the Project Settings page.

#### Next Steps

- [Uploading Files for Localization]({{ site.baseurl }}{% link _docs/uploading-files.md %})
- [Advanced Project Setup]({{ site.baseurl }}{% link _docs/advanced-project-setup.md %})
- [Uploading Existing Translations]({{ site.baseurl }}{% link _docs/uploading-translations.md %})
- [Inviting Project Participants]({{ site.baseurl }}{% link _docs/inviting-participants.md %})

Type can be a standard Javascript object like:
* `String`
* `Number`
* `Boolean`
* `Object`


