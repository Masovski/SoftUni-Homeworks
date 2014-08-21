<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>CV Generator</title>
    <link href="05. CVGenerator.css" rel="stylesheet"/>
    <script src="05. CVGenerator.js"></script>
</head>
<body>
    <div id="wrapper">
        <form method="post" action="05. CVGenerator_results.php">
            <fieldset>
                <legend>Personal Information</legend>
                <input type="text" name="firstName" placeholder="First Name" autofocus><br/>
                <input type="text" name="lastName" placeholder="Last Name"/><br/>
                <input type="email" name="email" placeholder="Email"/><br/>
                <input type="text" name="phoneNumber" placeholder="Phone Number"/><br/>

                <label for="female">Female</label>
                <input type="radio" name="sex" value="Female" id="female"/>
                <label for="male">Male</label>
                <input type="radio" name="sex" value="Male" id="male"/><br/>

                <label for="birthdate">Birth Date</label><br/>
                <input type="date" name="birthdate" id="birthdate"/><br/>
                <label for="nationality">Nationality</label><br/>
                <select name="nationality" id="nationlity">
                    <option value="Bulgarian">Bulgarian</option>
                    <option value="English">English</option>
                    <option value="American">American</option>
                    <option value="Russian">Russian</option>
                    <option value="Other">Other</option>
                </select>
            </fieldset>

            <fieldset>
                <legend>Last Work Position</legend>
                <label for="company">Company Name</label>
                <input type="text" name="company" id="company"/><br/>
                <label for="from">From</label>
                <input type="date" name="from" id="from"/><br/>
                <label for="to">To</label>
                <input type="date" name="to" id="to"/>
            </fieldset>

            <fieldset>
                <legend>Computer Skills</legend>
                <label for="prog-languages">Programming Languages</label><br/>
                <input type="text" name="prog-lang[]" id="prog-languages"/>
                <select name="prog-level[]">
                    <option value="Beginner">Beginner</option>
                    <option value="Programmer">Programmer</option>
                    <option value="Ninja">Ninja</option>
                </select><br/>
                <div id="prog-langs"></div>
                <button type="button" onclick="removeProgLanguage('prog-lang'+nextId)">Remove Language</button>
                <button type="button" onclick="addProgLanguage()">Add Language</button>
            </fieldset>

            <fieldset>
                <legend>Other Skills</legend>
                <label for="languages">Languages</label><br/>
                <input type="text" name="lang[]" id="languages"/>
                <select name="compr-level[]">Comprehension
                    <option selected>-Comprehension-</option>
                    <option value="Beginner">Beginner</option>
                    <option value="Intermediate">Intermediate</option>
                    <option value="Advanced">Advanced</option>
                </select>
                <select name="read-level[]">
                    <option selected>-Reading-</option>
                    <option value="Beginner">Beginner</option>
                    <option value="Intermediate">Intermediate</option>
                    <option value="Advanced">Advanced</option>
                </select>
                <select name="write-level[]">
                    <option selected>-Writing-</option>
                    <option value="Beginner">Beginner</option>
                    <option value="Intermediate">Intermediate</option>
                    <option value="Advanced">Advanced</option>
                </select><br/>
                <div id="langs"></div>
                <button type="button" onclick="removeLanguage('lang' + nextId2)">Remove Language</button>
                <button type="button" onclick="addLanguage()">Add Language</button>
                <br/>
                <span>Driver License</span><br/>
                <label for="b">B</label>
                <input type="checkbox" name="category[]" value="B" id="b"/>
                <label for="a">A</label>
                <input type="checkbox" name="category[]" value="A" id="a"/>
                <label for="c">C</label>
                <input type="checkbox" name="category[]" value="C" id="c"/>
            </fieldset>
            <input type="submit" value="Generate CV"/>
        </form>
    </div>
</body>
</html>