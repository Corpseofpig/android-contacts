package ru.yandex.practicum.contacts.presentation.base;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
public class BaseListDiffCallback<T extends ListDiffInterface<T>> extends DiffUtil.ItemCallback<T> {
    @Override
    public boolean areItemsTheSame(@NonNull T oldItem, @NonNull T item) {
        return oldItem.theSameAs(item);
    }
    @Override
    public boolean areContentsTheSame(@NonNull T oldItem, @NonNull T item) {
        return oldItem.equals(item);
    }
    @Nullable
    @Override
    public Object getChangePayload(@NonNull T oldItem, @NonNull T item) {
        return item;
    }
}
