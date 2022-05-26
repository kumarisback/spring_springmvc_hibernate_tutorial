package com.hibernate.eg;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail {
	
	
	
	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		
		this.instructor = instructor;
	}
	
	
	//here instructordetail is field name used in  instructor class
	@OneToOne(mappedBy="instructordetail", cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Instructor instructor;

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
