# 简介
selenide是另外一种web自动化框架,比seleium更灵活.

使用selenide + testng + allure

# selenide介绍
## 官网
https://selenide.org/quick-start.html

## api文档
https://selenide.org/documentation.html

# allure
## 安装
brew install allure

## 项目配置
详见pom.xml文件


# 运行
根目录:run.sh


# api使用
## 断言元素是否存在

$x(pushjob).should(exist);

```
Element not found {By.xpath: /html/body/div[2]/div/div[2]/a[1]}
Expected: exist
```
 