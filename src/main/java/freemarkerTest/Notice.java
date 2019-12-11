package freemarkerTest;

public class Notice {
	private String recipient;
	private String content;
	private String publisher;
	private String dateTime;
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
	public Notice() {
		super();
	}
	public Notice(String recipient, String content, String publisher, String dateTime) {
		super();
		this.recipient = recipient;
		this.content = content;
		this.publisher = publisher;
		this.dateTime = dateTime;
	}
	
}
