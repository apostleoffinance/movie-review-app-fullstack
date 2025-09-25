package dev.olaoluwa.movies;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

 import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    private String id;

    private String imdbId;

    private String title;

    private String releaseDate;

    private String trailerLink;

    private String poster;

    private List<String> genres;

    private List<String> backdrops;

    @DocumentReference
    private List<Review> reviewIds;



}


//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.mongodb.core.mapping.DocumentReference;
//
//@Document(collection = "movies")
//public class Movie {
//
//    @Id
//    private String id;
//    private String imdbId;
//    private String title;
//    private String releaseDate;
//    private String trailerLink;
//    private String poster;
//    private List<String> genres;
//    private List<String> backdrops;
//
//    @DocumentReference
//    private List<Review> reviewIds;
//
//    // Getters and Setters
//    public String getId() { return id; }
//    public void setId(String id) { this.id = id; }
//
//    public String getImdbId() { return imdbId; }
//    public void setImdbId(String imdbId) { this.imdbId = imdbId; }
//
//    public String getTitle() { return title; }
//    public void setTitle(String title) { this.title = title; }
//
//    public String getReleaseDate() { return releaseDate; }
//    public void setReleaseDate(String releaseDate) { this.releaseDate = releaseDate; }
//
//    public String getTrailerLink() { return trailerLink; }
//    public void setTrailerLink(String trailerLink) { this.trailerLink = trailerLink; }
//
//    public String getPoster() { return poster; }
//    public void setPoster(String poster) { this.poster = poster; }
//
//    public List<String> getGenres() { return genres; }
//    public void setGenres(List<String> genres) { this.genres = genres; }
//
//    public List<String> getBackdrops() { return backdrops; }
//    public void setBackdrops(List<String> backdrops) { this.backdrops = backdrops; }
//
//    public List<Review> getReviewIds() { return reviewIds; }
//    public void setReviewIds(List<Review> reviewIds) { this.reviewIds = reviewIds; }
//}
