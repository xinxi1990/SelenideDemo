#!/usr/bin/env bash

mvn clean test
#allure serve allure-results
allure generate --clean allure-results -o report
echo "报告地址:"`pwd`"/report/index.html"

