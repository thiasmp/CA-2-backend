[![Build Status](https://travis-ci.org/dat3startcode/rest-jpa-devops-startcode.svg?branch=master)](https://travis-ci.org/dat3startcode/rest-jpa-devops-startcode)

_This project is meant as start code for projects and exercises given in Flow-1+2 at http://cphbusiness.dk in the Study Program "AP degree in Computer Science"_

_Projects which are expected to use this start-code are projects that require all, or most of the following technologies:_

- _JPA and REST_
- _Testing, including database test_
- _Testing, including tests of REST-API's_
- _CI and CONTINUOUS DELIVERY_

### Preconditions

_In order to use this code, you should have a local developer setup + a "matching" droplet on Digital Ocean as described in the 3. semester guidelines_

# Getting Started

This document explains how to use this code (build, test and deploy), locally with maven, and remotely with maven controlled by Travis

- [How to use](https://docs.google.com/document/d/1K6s6Tt65bzB8bCSE_NUE8alJrLRNTKCwax3GEm4OjOE/edit?usp=sharing)

# Startcode

I started by downloading the startcode, changed the artifact-ID in the pom.xml and reloaded the maven.
Then i set up my connection to mysql and created 2 new tables, CA2 and CA2_test to use.
After that i ran the SetupTestUsers, and checked if the users were created in my database and if their passwords were incrypted.
I then checked if my frontend was working as well, and changed the url in facade to match my WAR.

I then began making a new dto for a new api-call, where i can check the avereage age of a certain name.
Since it's close to the genderize page, i reused a bit of that code, and then added it to ourDTO.
Then i made a new component in the frontend, and added a box where i can write a name instead of it just pulling a hardcoded one.
I made a new route and in app.js.

Our dog was supposed to show a picture of a dog, but only showed the url, so i made some small changes there.

After that i used nginx to deploy the frontend, but it made my backend inaccessible, and i haven't figured out how to fix it, since all the tips didnt help.

# ca2-backend-startcode

# CA-2-backend
