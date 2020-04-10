
    import org.launchcode.Movie;

    import java.io.*;
    import java.util.*;


   

    public class MovieLists<Genre, Movie> {
        private ArrayList<Movie > movies;
        File inFile = new File("movie.csv");

        public MovieLists(ArrayList<Movie> movies) throws IOException {
            this.movies = movies;
        }


        // Read in the file

            FileInputStream in = new FileInputStream(inFile);

            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] args = line.split(",");
                        String title = args[1].trim();
                        String[] genres = args[2].split(" ");
                        HashSet<Genre> m;
                        m = new HashSet<Genre>();


                /* Finding number of occurrence; how many movies are classified under each genre*/

                        for (int x = 0; x < genres.length; x++) {

                            if (genres[x].equals("Action")) {

                                    int count = 0;
                                    count+=1;

                            } else if (genres[x].equals("Drama")) {
                                int count = 0;
                                count+=1;

                            } else if (genres[x].equals("Adventure")) {
                                int count = 0;
                                count+=1;

                            } else if (genres[x].equals("Comedy")) {
                                int count = 0;
                                count+=1;

                            } else if (genres[x].equals("Horror")) {
                                int count = 0;
                                count+=1;

                            } else if (genres[x].equals("Sci-fi")) {
                                int count = 0;
                                count+=1;

                            } else if (genres[x].equals("Thriller")) {
                                int count = 0;
                                count+=1;

                            } else if (genres[x].equals("Romance")) {
                                int count = 0;
                                count+=1;

                            }

                        }


                // Find how many movies of each genre came out each year


                String genre_name;

                if(genre_name.equals("Comedy");
                {
                    genres.getYear(title.substring(title.length()-5, title.length()-1));
                }
                if(genre_name.equals("Adventure") {
                    genres.getYear(title.substring(title.length()-5, title.length()-1));
                }
                if(genre_name.equals("Horror") {
                    genres.getYear(title.substring(title.length()-5, title.length()-1));
                }
                if(genre_name.equals("Sci-fi") {
                    genres.getYear(title.substring(title.length()-5, title.length()-1));
                }
                if(genre_name.equals("Thriller") {
                    genres.getYear(title.substring(title.length()-5, title.length()-1));
                }
                if(genre_name.equals("Romance") {
                    genres.getYear(title.substring(title.length()-5, title.length()-1));;
                }



            }
                }

        }



