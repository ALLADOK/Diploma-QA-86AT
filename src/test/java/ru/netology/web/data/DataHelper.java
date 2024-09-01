package ru.netology.web.data;


import lombok.Value;

public class DataHelper {
    static DataGenerator dataGenerator = new DataGenerator();


    @Value
    public static class CardInfo {
        String cardNumber;
        String year;
        String month;
        String owner;
        String cvc;
    }

    public static CardInfo getApprovedCardInformation() {
        return new CardInfo(DataGenerator.getApprovedCardNumber(), dataGenerator.getValidExpirationDate().getYear(), dataGenerator.getValidMonth().getMonth(), DataGenerator.getValidOwner(), DataGenerator.getValidCvc());
    }

    public static CardInfo getDeclinedCardInformation() {
        return new CardInfo(DataGenerator.getDeclinedCardNumber(), dataGenerator.getValidExpirationDate().getYear(), dataGenerator.getValidMonth().getMonth(), DataGenerator.getValidOwner(), DataGenerator.getValidCvc());
    }

    public static CardInfo getInvalidCardInformation() {
        return new CardInfo(DataGenerator.getInvalidCardNumber(), dataGenerator.getValidExpirationDate().getYear(), dataGenerator.getValidMonth().getMonth(), DataGenerator.getValidOwner(), DataGenerator.getValidCvc());
    }

    public static CardInfo getExpiredMonthCardInformation() {
        return new CardInfo(DataGenerator.getApprovedCardNumber(), dataGenerator.getCurrentYear().getYear(), dataGenerator.getExpiredMonth().getMonth(), DataGenerator.getValidOwner(), DataGenerator.getValidCvc());
    }

    public static CardInfo getExpiredYearCardInformation() {
        return new CardInfo(DataGenerator.getApprovedCardNumber(), dataGenerator.getExpiredYear().getYear(), dataGenerator.getValidMonth().getMonth(), DataGenerator.getValidOwner(), DataGenerator.getValidCvc());
    }

    public static CardInfo getInvalidExpirationDateCardInformation() {
        return new CardInfo(DataGenerator.getApprovedCardNumber(), dataGenerator.getInvalidExpirationDate().getYear(), dataGenerator.getValidMonth().getMonth(), DataGenerator.getValidOwner(), DataGenerator.getValidCvc());
    }

    public static CardInfo getEmptyCardInformation() {
        return new CardInfo(" ", " ", " ", " ", " ");
    }

    public static CardInfo getValidCardNumberWithInvalidOtherFields() {
        return new CardInfo(DataGenerator.getApprovedCardNumber(), dataGenerator.getInvalidYear().getYear(), dataGenerator.getInvalidMonth().getMonth(), DataGenerator.getInvalidOwner(), DataGenerator.getInvalidCvc());
    }

    public static CardInfo getInvalidOwnerCard() {
        return new CardInfo(DataGenerator.getApprovedCardNumber(), dataGenerator.getValidExpirationDate().getYear(), dataGenerator.getValidMonth().getMonth(), DataGenerator.getInvalidOwner(), DataGenerator.getValidCvc());
    }


}