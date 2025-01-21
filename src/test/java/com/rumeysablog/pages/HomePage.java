package com.rumeysablog.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class HomePage extends BasePage {

    @FindBy(css = ".hero-content h1")
    private WebElement nameElement;

    @FindBy(css = ".hero-content h2")
    private WebElement titleElement;

    @FindBy(css = ".nav-links li a")
    private List<WebElement> navigationLinks;

    @FindBy(css = ".hero-social .fa-linkedin")
    private WebElement linkedInLink;

    @FindBy(css = ".hero-social .fa-github")
    private WebElement githubLink;

    @FindBy(css = ".skills-section")
    private WebElement skillsSection;

    @FindBy(css = ".experience-section")
    private WebElement experienceSection;

    @FindBy(css = ".education-section")
    private WebElement educationSection;

    @FindBy(css = "a[href='#about']")
    private WebElement aboutLink;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getName() {
        waitForElementVisible(nameElement);
        return nameElement.getText();
    }

    public String getTitle() {
        waitForElementVisible(titleElement);
        return titleElement.getText();
    }

    public List<String> getNavigationLinks() {
        waitForElementVisible(navigationLinks.get(0));
        return navigationLinks.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public boolean isLinkedInLinkVisible() {
        waitForElementVisible(linkedInLink);
        return linkedInLink.isDisplayed();
    }

    public boolean isGitHubLinkVisible() {
        waitForElementVisible(githubLink);
        return githubLink.isDisplayed();
    }

    public void navigateToAbout() {
        waitForElementClickable(aboutLink);
        aboutLink.click();
    }

    public boolean isSkillsSectionVisible() {
        waitForElementVisible(skillsSection);
        return skillsSection.isDisplayed();
    }

    public boolean isExperienceSectionVisible() {
        waitForElementVisible(experienceSection);
        return experienceSection.isDisplayed();
    }

    public boolean isEducationSectionVisible() {
        waitForElementVisible(educationSection);
        return educationSection.isDisplayed();
    }
}
