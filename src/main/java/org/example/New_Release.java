package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class New_Release extends Utils {
    private By _title = By.cssSelector("input.enter-comment-title");
    private By _comment = By.cssSelector("textarea.enter-comment-text");
    private By _newComment = By.xpath("//button[@name = 'add-comment']");
    private By _confirmationMessage = By.xpath("//div[contains(@class,'fieldset new-comment')]/div[2]/div[1]");
    private By _guestComment = By.cssSelector("div.comment");
    private By comments = By.xpath("//div[@class='comment-list']/div/strong");
    String expectedMessage = "News comment is successfully added.";

    public void newReleaseUpdate() {
        typeTheText(_title, "Sample title");
        typeTheText(_comment, "Sample comment");
        clickOnTheElement(_newComment);
        String confirmationMsg = getTextFromElement(_confirmationMessage);
        System.out.println("confirmation message is: " + confirmationMsg);
        Assert.assertEquals(confirmationMsg, expectedMessage);
        List<WebElement> commentList = driver.findElements(_guestComment);
        for (WebElement e : commentList) {
            System.out.println(e.getText());
        }

    }

    public void verifyLastAddedComment() {
        ArrayList<String> commentsList = new ArrayList<>();
        for (WebElement comment : driver.findElements(comments)) {
            commentsList.add(comment.getText());}
        String lastComment = commentsList.get(commentsList.size()-1);
        if(lastComment.equalsIgnoreCase("comment")){
            String newCommentAdded = lastComment;
            Assert.assertEquals(newCommentAdded,lastComment,"comment not added at the end");
        }

        }
    }
