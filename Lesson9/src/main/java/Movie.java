import com.google.gson.annotations.SerializedName;

public class Movie {
    @SerializedName("id")
    private int id;
    @SerializedName("Title")
    private String title;
    @SerializedName("Genre")
    private String genre;
    @SerializedName("runtime")
    private int time;
    @SerializedName("studio")
    private String studio;
    @SerializedName("year")
    private long year;

    public Movie() {
    }

    public Movie(int id, String title, String genre, int time, String studio, long year) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.time = time;
        this.studio = studio;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", time=" + time +
                ", studio='" + studio + '\'' +
                ", year=" + year +
                '}';
    }
}
