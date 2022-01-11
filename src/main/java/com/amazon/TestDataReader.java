package com.amazon;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestDataReader {

    public static Properties getTestData() throws IOException {
        FileInputStream fp = new FileInputStream("src\\main\\resources\\testdata.properties");
        Properties properties = new Properties();
        properties.load(fp);
        return properties;
    }

    public static String getUrl() throws IOException {
        return getTestData().getProperty("baseUrl");
    }

    public static String getNode() throws IOException {
        return getTestData().getProperty("nodeUrl");
    }

    public static String getBrowser() throws IOException {
        return getTestData().getProperty("browser");
    }

    public static String getUsername() throws IOException {
        return getTestData().getProperty("username");
    }

    public static String getPassword() throws IOException {
        return getTestData().getProperty("password");
    }

    public static String getToyName() throws IOException {
        return getTestData().getProperty("toyName");
    }
    public static String getCountryRegion() throws IOException{
        return getTestData().getProperty("countryRegion");
    }
    public static String getFullName() throws IOException {
        return getTestData().getProperty("fullName");
    }

    public static String getPhoneNumber() throws IOException {
        return getTestData().getProperty("phoneNumber");
    }

    public static String getPostcode() throws IOException {
        return getTestData().getProperty("postcode");
    }

    public static String getAddressLineOrCompany() throws IOException {
        return getTestData().getProperty("addressLineOrCompany");
    }

    public static String getTownOrCity() throws IOException {
        return getTestData().getProperty("townOrCity");
    }

    public static String getCountry() throws IOException {
        return getTestData().getProperty("country");
    }

}
