package com.app.dca.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Feed {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int feedId;
	
	private String query;
	private LocalDate feedDate;
	private LocalTime feedTime;
	private String topic;	// Programming/Java/Testing
	private int relevance;// Likes on Feed increase relevance, write custom query
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "emailId", referencedColumnName = "email")
	private Developer dev;
	
	@OneToMany(mappedBy = "respId")
	private List<Response> responses;
	
	private int totalComments;
	
	public Feed(int feedId, String query, LocalDate feedDate, LocalTime feedTime, String topic, int relevance,
			Developer dev, List<Response> responses, int totalComments) {
		super();
		this.feedId = feedId;
		this.query = query;
		this.feedDate = feedDate;
		this.feedTime = feedTime;
		this.topic = topic;
		this.relevance = relevance;
		this.dev = dev;
		this.responses = responses;
		this.totalComments = totalComments;
	}
	
	public int getFeedId() {
		return feedId;
	}
	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public LocalDate getFeedDate() {
		return feedDate;
	}
	public void setFeedDate(LocalDate feedDate) {
		this.feedDate = feedDate;
	}
	public LocalTime getFeedTime() {
		return feedTime;
	}
	public void setFeedTime(LocalTime feedTime) {
		this.feedTime = feedTime;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public int getRelevance() {
		return relevance;
	}
	public void setRelevance(int relevance) {
		this.relevance = relevance;
	}
	public Developer getDev() {
		return dev;
	}
	public void setDev(Developer dev) {
		this.dev = dev;
	}
	public List<Response> getResponses() {
		return responses;
	}
	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}
	public int getTotalComments() {
		return totalComments;
	}
	public void setTotalComments(int totalComments) {
		this.totalComments = totalComments;
	}
    
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((feedDate == null) ? 0 : feedDate.hashCode());
		result = prime * result + feedId;
		result = prime * result + ((feedTime == null) ? 0 : feedTime.hashCode());
		result = prime * result + ((query == null) ? 0 : query.hashCode());
		result = prime * result + relevance;
		result = prime * result + ((responses == null) ? 0 : responses.hashCode());
		result = prime * result + ((topic == null) ? 0 : topic.hashCode());
		result = prime * result + totalComments;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Feed other = (Feed) obj;
		if (feedDate == null) {
			if (other.feedDate != null)
				return false;
		} else if (!feedDate.equals(other.feedDate))
			return false;
		if (feedId != other.feedId)
			return false;
		if (feedTime == null) {
			if (other.feedTime != null)
				return false;
		} else if (!feedTime.equals(other.feedTime))
			return false;
		if (query == null) {
			if (other.query != null)
				return false;
		} else if (!query.equals(other.query))
			return false;
		if (relevance != other.relevance)
			return false;
		if (responses == null) {
			if (other.responses != null)
				return false;
		} else if (!responses.equals(other.responses))
			return false;
		if (topic == null) {
			if (other.topic != null)
				return false;
		} else if (!topic.equals(other.topic))
			return false;
		if (totalComments != other.totalComments)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Feed [feedId=" + feedId + ", query=" + query + ", feedDate=" + feedDate + ", feedTime=" + feedTime
				+ ", topic=" + topic + ", relevance=" + relevance + ", dev=" + dev + ", responses=" + responses
				+ ", totalComments=" + totalComments + "]";
	}
	
	
}
