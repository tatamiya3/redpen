/**
 * redpen: a text inspection tool
 * Copyright (c) 2014-2015 Recruit Technologies Co., Ltd. and contributors
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
package cc.redpen.validator;

import cc.redpen.model.Sentence;

class ValidationErrorMessageTest extends Validator {

    @Override
    public void validate(Sentence sentence) {
        addValidationError(sentence, 1, 2, 3, "sentence");
        addValidationError("withKey", sentence, "sentence");
        addValidationErrorFromToken(sentence, sentence.getTokens().get(0));
    }
}
