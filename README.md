# Healenium-BrowserStack Example

[![Docker Pulls](https://img.shields.io/docker/pulls/healenium/hlm-backend.svg?maxAge=25920)](https://hub.docker.com/u/healenium)
[![License](https://img.shields.io/badge/license-Apache-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[![@healenium](https://img.shields.io/badge/Telegram-%40healenium-orange.svg)](https://t.me/healenium)

### Table of Contents

[Overall information](#overall-information)

[Healenium BrowserStack installation](#healenium-browserstack-installation)
[Configure Healenium-Proxy with Docker](#configure-healenium-proxy-with-docker)
[Configure Healenium-Proxy without Docker](#configure-healenium-proxy-without-docker)


### Overall information
Healenium-BrowserStack example demos java project to test both web app and native apps using Selenium/Appium.

### Healenium BrowserStack installation

Clone Healenium repository:
```sh
git clone https://github.com/healenium/healenium.git
```

### Configure Healenium-Proxy with Docker

Replace SELENIUM_SERVER_URL and APPIUM_SERVER_URL env variables of healenium-proxy service in the <b>docker-compose-appium.yaml</b> 
or shell-installation/selenium-grid/start_healenium.sh (without docker) to 
```
http://User_Name:Access_Key@hub.browserstack.com/wd/hub 
```

User_Name - your BrowserStack User Name  
Access_Name - your BrowserStack Access Name

#### Run Healenium:
```sh
docker-compose -f docker-compose-appium.yaml up -d
```

### Configure Healenium-Proxy without Docker

Replace SELENIUM_SERVER_URL and APPIUM_SERVER_URL env variables of healenium-proxy service in the 
<b>shell-installation/selenium-grid/start_healenium.sh</b> to
```
http://User_Name:Access_Key@hub.browserstack.com/wd/hub 
```

User_Name - your BrowserStack User Name  
Access_Name - your BrowserStack Access Name

#### Run Healenium using bash scripts:
```sh
./download_services.sh
```

```sh
./start_healenium.sh
```


Run example tests

```sh
mvn clean test
```

## Community / Support

* [Telegram chat](https://t.me/healenium)
* [GitHub Issues](https://github.com/healenium/healenium/issues)
* [YouTube Channel](https://www.youtube.com/channel/UCsZJ0ri-Hp7IA1A6Fgi4Hvg)