/*
package io.javabrains.springbootstarter.topic;



public class Course {
    private String id;
    private String name;
    public String description;


    public Course(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Course() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
*/

package io.javabrains.springbootstarter.topic;



import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="topicnewnewwithintid")

public class Topic {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)

  //  @Column(name="id")

    private int id;
  //  @Column(name="name")
  @NotBlank
    private String name;
   // @Column(name="description")
 @NotBlank
    public String description;


    public Topic(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Topic() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
