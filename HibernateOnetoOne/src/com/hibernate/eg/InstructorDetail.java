package com.hibernate.eg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="youtube_channel")
	private String YoutubeChannel;
	
	@Column(name="hobby")
	private String hobby;
	
	public InstructorDetail() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYoutubeChannel() {
		return YoutubeChannel;
	}

	public void setYoutubeChannel(String youtubeChannel) {
		YoutubeChannel = youtubeChannel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", YoutubeChannel=" + YoutubeChannel + ", hobby=" + hobby + "]";
	}

	public InstructorDetail(String youtubeChannel, String hobby) {
		YoutubeChannel = youtubeChannel;
		this.hobby = hobby;
	}
}
