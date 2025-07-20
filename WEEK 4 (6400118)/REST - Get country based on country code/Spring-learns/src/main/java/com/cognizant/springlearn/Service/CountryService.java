package com.cognizant.springlearn.Service;

import com.cognizant.springlearn.model.Country;
import org.springframework.stereotype.Service;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    public Country getCountry(String code) {
        List<Country> countryList = getCountryList();

        // Lambda expression for case-insensitive search
        return countryList.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }

    private List<Country> getCountryList() {
        List<Country> countries = new ArrayList<>();

        try {
            InputStream is = getClass().getClassLoader().getResourceAsStream("country.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(is);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("country");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String code = element.getElementsByTagName("code").item(0).getTextContent();
                    String name = element.getElementsByTagName("name").item(0).getTextContent();

                    countries.add(new Country(code, name));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return countries;
    }
}
