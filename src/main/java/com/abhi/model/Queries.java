package com.abhi.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "Queries")
public class Queries {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Queries_id")
	private Long QueriesId;
	@Column(name = "Topic")
	private String topicName;
//	@JoinColumn(name = "subject_id")
//	private String subject;
	@Column(name = "comments")
	private String comment;
	@Column(name = "user_id")
	private int userId;
	
	public Queries() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Queries(Long queriesId, String topicName, String subject, String comment, int userId) {
		super();
		QueriesId = queriesId;
		this.topicName = topicName;
		//this.subject = subject;
		this.comment = comment;
		this.userId = userId;
	}

	public Long getQueriesId() {
		return QueriesId;
	}

	public void setQueriesId(Long queriesId) {
		QueriesId = queriesId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

//	public String getSubject() {
//		return subject;
//	}

//	public void setSubject(String subject) {
//		this.subject = subject;
//	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((QueriesId == null) ? 0 : QueriesId.hashCode());
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		//result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		result = prime * result + ((topicName == null) ? 0 : topicName.hashCode());
		result = prime * result + userId;
		return result;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Queries other = (Queries) obj;
//		if (QueriesId == null) {
//			if (other.QueriesId != null)
//				return false;
//		} else if (!QueriesId.equals(other.QueriesId))
//			return false;
//		if (comment == null) {
//			if (other.comment != null)
//				return false;
//		} else if (!comment.equals(other.comment))
//			return false;
//		if (subject == null) {
//			if (other.subject != null)
//				return false;
//		} else if (!subject.equals(other.subject))
//			return false;
//		if (topicName == null) {
//			if (other.topicName != null)
//				return false;
//		} else if (!topicName.equals(other.topicName))
//			return false;
//		if (userId != other.userId)
//			return false;
//		return true;
//	}

	@Override
	public String toString() {
		return "Queries [QueriesId=" + QueriesId + ", topicName=" + topicName + ", subject=" + /*subject + */", comment="
				+ comment + ", userId=" + userId + "]";
	}
	
	

}
