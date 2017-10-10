<template>
  <div>
        <form class="" @submit.prevent="validateBeforeSubmit" :disabled="componentNewFeature.submitted">
          <div class="sui-m-form-group">
            <label for="name" class="sui-a-form-label as--inline">Feature's name</label>
            <input type="text" class="sui-a-form-control" id="name" v-model="componentNewFeature.name" :disabled="componentNewFeature.submitted" v-validate.initial="'required|min:10'">
            <p class="text-danger" v-if="errors.has('required')">{{ errors.first('required') }}</p>
          </div>
          <div class="sui-m-form-group">
            <label for="description" class="sui-a-form-label">Description </label>
            <textarea  rows="5"  class="sui-a-form-control" id="description" v-model="componentNewFeature.description" :disabled="componentNewFeature.submitted" v-validate.initial="'required|min:50'"></textarea>
            <p class="text-danger" v-if="errors.has('description')">sdfs {{ errors.first('description') }}</p>
          </div>
          <div class="sui-m-form-group">
            <label for="themes" class="sui-a-form-label as--inline">Themes</label>
            <input type="text" class="sui-a-form-control" id="themes" v-model="componentNewFeature.themes" :disabled="componentNewFeature.submitted">
          </div>
          <div class="sui-m-form-group">
            <button type="submit" class="sui-a-button as--primary" :disabled="componentNewFeature.submitted">Add Feature</button>
          </div>
        </form>
        <div class="sui-m-form-group">
          <div class="sui-a-form-feedback as--success" v-show="componentNewFeature.messageAdded">
            <i class="sui-a-icon as--fa-check-circle"></i>
            Feature added!
          </div>
        </div>
      </div>
</template>

<script>
  import Vue from 'vue';
  import { mapActions, mapGetters } from 'vuex';
  import VeeValidate from 'vee-validate';

  Vue.use(VeeValidate);

  export default {
    name: 'newFeature',
    data() {
      return {
        name: '',
        description: '',
        submitted: false,
        messageAdded: false,
      };
    },
    computed: {
      newfeature() {
        return {
          name: this.componentNewFeature.name,
          description: this.componentNewFeature.description,
        };
      },
      ...mapGetters(['componentNewFeature']),
    },
    methods: {
      ...mapActions([
        'addFeature',
      ]),
      validateBeforeSubmit() {
        this.$validator.validateAll();
        if (!this.errors.any()) {
          this.addFeature(this.newfeature);
        }
      },
    },
  };
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
