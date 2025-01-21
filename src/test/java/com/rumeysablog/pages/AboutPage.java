package com.rumeysablog.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class AboutPage extends BasePage {

    @FindBy(css = ".skills-list li")
    private List<WebElement> skillsList;

    @FindBy(css = ".experience-item")
    private List<WebElement> experienceItems;

    @FindBy(css = ".education-item")
    private List<WebElement> educationItems;

    public AboutPage(WebDriver driver) {
        super(driver);
    }

    public List<String> getSkills() {
        return skillsList.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public List<String> getExperienceCompanies() {
        return experienceItems.stream()
                .map(item -> item.findElement(org.openqa.selenium.By.className("company")).getText())
                .collect(Collectors.toList());
    }

    public List<String> getEducationInstitutions() {
        return educationItems.stream()
                .map(item -> item.findElement(org.openqa.selenium.By.tagName("h4")).getText())
                .collect(Collectors.toList());
    }
}
