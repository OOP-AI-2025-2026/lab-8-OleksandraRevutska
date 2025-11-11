package ua.opnu;

class BookData implements Comparable<BookData> {
    private String title;
    private String author;
    private int reviews;
    private double total;

    public BookData(String title, String author, int reviews, double total) {
        this.title = title;
        this.author = author;
        this.reviews = reviews;
        this.total = total;
    }

    private double getRating() {
        return reviews == 0 ? 0 : total / reviews;
    }

    @Override
    public int compareTo(BookData other) {
        double myRating = this.getRating();
        double otherRating = other.getRating();

        if (myRating > otherRating) return -1;  // більший рейтинг -> "менше"
        if (myRating < otherRating) return 1;

        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return title + " (" + getRating() + ")";
    }
}
