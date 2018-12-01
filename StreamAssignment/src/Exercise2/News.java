package Exercise2;

public class News {
int newsId;
String postedByUser;
String CommentByUser;
String Comment;
public News(int newsId, String postedByUser, String commentByUser,
		String comment) {
	super();
	this.newsId = newsId;
	this.postedByUser = postedByUser;
	this.CommentByUser = commentByUser;
	this.Comment = comment;
}
public int getNewsId() {
	return newsId;
}
public void setNewsId(int newsId) {
	this.newsId = newsId;
}
public String getPostedByUser() {
	return postedByUser;
}
public void setPostedByUser(String postedByUser) {
	this.postedByUser = postedByUser;
}
public String getCommentByUser() {
	return CommentByUser;
}
public void setCommentByUser(String commentByUser) {
	CommentByUser = commentByUser;
}
public String getComment() {
	return Comment;
}
public void setComment(String comment) {
	Comment = comment;
}
@Override
public String toString() {
	return "News [newsId=" + newsId + ", postedByUser=" + postedByUser
			+ ", CommentByUser=" + CommentByUser + ", Comment=" + Comment + "]";
}

}







