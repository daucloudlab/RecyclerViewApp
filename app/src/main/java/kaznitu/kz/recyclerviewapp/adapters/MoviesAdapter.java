package kaznitu.kz.recyclerviewapp.adapters;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import kaznitu.kz.recyclerviewapp.R;
import kaznitu.kz.recyclerviewapp.models.Movie;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder>{
    private List<Movie> moviesList ;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title, genre, year ;

        public MyViewHolder(View view){
            super(view);
            title = (TextView)view.findViewById(R.id.title) ;
            genre = (TextView)view.findViewById(R.id.genre) ;
            year = (TextView)view.findViewById(R.id.year) ;
        }
    }

    public MoviesAdapter(List<Movie> moviesList){
        this.moviesList = moviesList ;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.movie_list_row, parent, false) ;

        return new MyViewHolder(itemView) ;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
//        super.onBindViewHolder(holder, position, payloads);
        Movie movie = moviesList.get(position) ;
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
