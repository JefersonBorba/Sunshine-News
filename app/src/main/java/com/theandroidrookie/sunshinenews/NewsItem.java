package com.theandroidrookie.sunshinenews;

public class NewsItem {

    /** The article's title */
    private String mTitle;

    /** The section the article belongs to */
    private String mSectionName;

    /** Url for the article's webpage */
    private String mWebURL;

    /** Publication date and time of the article */
    private String mPublicationDate;

    /** Contributor of the article */
    private String mAuthor;

    /**
     * Create a new NewsItem object
     * @param title is the article's title
     * @param sectionName is the section the article belongs to
     * @param webURL is the article's webpage Url
     * @param publicationDate is the article's publication date
     * @param author is the author name
     */
    public NewsItem(String title, String sectionName, String webURL, String publicationDate, String author) {
        mTitle = title;
        mSectionName = sectionName;
        mWebURL = webURL;
        mPublicationDate = publicationDate;
        mAuthor = author;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getWebURL() {
        return mWebURL;
    }

    public String getPublicationDate() {
        return mPublicationDate;
    }
    public String getAuthor() {
        return mAuthor;
    }
}
