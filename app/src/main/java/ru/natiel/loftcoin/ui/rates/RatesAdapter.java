package ru.natiel.loftcoin.ui.rates;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import ru.natiel.loftcoin.data.Coin;
import ru.natiel.loftcoin.databinding.LiRateBinding;

import java.util.Objects;

public class RatesAdapter extends ListAdapter<Coin, RatesAdapter.ViewHolder> {

    private LayoutInflater inflater;

    protected RatesAdapter() {
        super(new DiffUtil.ItemCallback<Coin>() {
                  @Override
                  public boolean areItemsTheSame(@NonNull Coin oldItem, @NonNull Coin newItem) {
                      return oldItem.id() == newItem.id();
                  }

                  @Override
                  public boolean areContentsTheSame(@NonNull Coin oldItem, @NonNull Coin newItem) {
                      return Objects.equals(oldItem, newItem);
                  }
              }
        );
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LiRateBinding.inflate(inflater, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.symbol.setText(getItem(position).symbol());
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private final LiRateBinding binding;

        public ViewHolder(@NonNull LiRateBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
