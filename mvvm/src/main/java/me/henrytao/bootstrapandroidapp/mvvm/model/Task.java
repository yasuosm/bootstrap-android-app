/*
 * Copyright 2016 "Henry Tao <hi@henrytao.me>"
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.henrytao.bootstrapandroidapp.mvvm.model;

/**
 * Created by henrytao on 6/18/16.
 */
public class Task {

  private String mDescription;

  private String mId;

  private String mTitle;

  public Task(String id, String title, String description) {
    mId = id;
    mTitle = title;
    mDescription = description;
  }

  public String getDescription() {
    return mDescription;
  }

  public String getId() {
    return mId;
  }

  public String getTitle() {
    return mTitle;
  }
}
