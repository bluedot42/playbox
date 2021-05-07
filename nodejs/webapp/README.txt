# Node.js Sample Web application

This is a node.js sample web application.

## Quick start

```
git pull
npm install
npm Start
```

Debug
`SET DEBUG=poc-nodejs-webapp:* & npm start`

## Environment variable

Add *.env* file in project root folder
`touch .env`

Add your configuration in the newly created *.env* file. A sample configuration is:
```json

```
**DO NOT** commit the *.env* file.

> This approach follows the *12 factor app* guide where env vars are granular controled ...

## TODO

[ ] MongoDB integratoin
[ ] Redis integration
[ ] MySQL integration
[ ] Add frontend pages
[ ] Swagger integratoin
[ ] Dockernize app