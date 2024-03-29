package com.example.jarenas.participamvp.presentation.views.interfaces;

import android.content.Context;

/**
 * Created by jarenas on 25/11/2015.
 *
 * Interface representing a View that will use to load data.
 */
public interface LoadDataView {

    /**
     * Get a {@link Context}.
     */
    Context getContext();

    /**
     * Show a view with a progress bar indicating a loading process.
     */
    void showLoading();

    /**
     * Hide a loading view.
     */
    void hideLoading();

    /**
     * Show a retry view in case of an error when retrieving data.
     */
    void showRetry();

    /**
     * Hide a retry view shown if there was an error when retrieving data.
     */
    void hideRetry();

    /**
     * Show an error message
     *
     * @param message A string representing an error.
     */
    void showError(String message);
}
