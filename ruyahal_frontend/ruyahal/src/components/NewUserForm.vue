<template>
    <div class="new-user">
        <form class="user-form">
            <h1 class="header">Kisisel Bilgiler</h1>
            <div class="un">
                <label for="user-name">Ad</label>
                <input type="text" name="user-name" v-model="user.name" /> <br />
            </div>
            <div class="uln">
                <label for="user-lastname">Soyad</label>
                <input type="text" name="user-lastname" v-model="user.lastname" /> <br />
            </div>
            <div class="dof">
                <label for="user-date-of-birth">Dogum Tarihi</label>
                <p>(gg-aa-yyyy)</p>
                <input type="text" name="user-date-of-birth" v-model="user.dateOfBirth" /> <br />
            </div>
            <div class="ug">
                <label for="user-gender">Cinsiyet</label>
                <input type="text" name="user-gender" v-model="user.gender" /> <br />
            </div>
            <div class="so">
                <label for="user-sexualOrientation">Cinsel Yonelim</label>
                <input type="text" name="user-sexual-orientation" v-model="user.sexualOrientation" /> <br />
            </div>
            <div class="ocp">
                <label for="user-occupation">Meslek</label>
                <input type="text" name="user-occupation" v-model="user.occupation" /> <br />
            </div>
            <div class="ms">
                <label for="user-marital-status">Medeni Durum</label>
                <input type="text" name="user-marital-status" v-model="user.maritalStatus" /> <br />
            </div>
            <div>
                <label for="user-religion">Dini Inanc</label>
                <input type="text" name="user-religion" v-model="user.religion" /> <br />
            </div>
            <div>
                <label for="user-email">Email</label>
                <input type="text" name="user-email" v-model="user.email" /> <br />
            </div>
            <div class="dream">
                <textarea name="dream" maxlength="250" cols="30" rows="10"></textarea>
            </div>
            <button @click="submitNewDream"></button>

        </form>
    </div>

</template>

<script>
export default {
    data(){
        return {
            user: {
                userId: -1,
                name: "",
                lastname: "",
                dateOfBirth: "",
                gender: "",
                sexualOrientation: "",
                occupation: "",
                maritalStatus: "",
                religion: "",
                email: "",
                enabled: false
            }
        }
        },
        methods: {
            submitNewDream
        }
    }
    
</script>

<style>

</style>