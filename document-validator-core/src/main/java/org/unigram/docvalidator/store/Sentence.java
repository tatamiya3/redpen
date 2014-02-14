/**
 * redpen: a text inspection tool
 * Copyright (C) 2014 Recruit Technologies Co., Ltd. and contributors
 * (see CONTRIBUTORS.md)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.unigram.docvalidator.store;

import java.util.ArrayList;
import java.util.List;

/**
 * Sentence block in a Document.
 */
public final class Sentence implements Block {
  /**
   * Constructor.
   *
   * @param sentenceContent  content of sentence
   * @param sentencePosition sentence position
   */
  public Sentence(String sentenceContent, int sentencePosition) {
    super();
    this.content = sentenceContent;
    this.position = sentencePosition;
    this.isStartParagraph = false;
    this.links = new ArrayList<String>();
  }

  public int getBlockID() {
    return 0;
  }

  /**
   * Content of string.
   */
  public String content;

  /**
   * Sentence position in a file.
   */
  public int position;

  /**
   * First sentence in a paragraph.
   */
  public boolean isStartParagraph;

  /**
   * Links (including internal and external ones)
   */
  public final List<String> links;

}