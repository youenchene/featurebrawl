<template>
  <div class="g-row as--h-align-center">
    <div class="g-col">
      <div class="g-col__inner">
        <form class="g-row as--h-align-center" @submit.prevent="addFeature(newfeature)">
          <div class="f-group g-col ">
            <label for="name">Feature's name</label>
            <input type="text" class="f-control" id="name" v-model="name">
          </div>
          <div class="f-group g-col">
            <label for="description">Description </label>
            <textarea  rows="5" class="f-control" id="description" v-model="description"></textarea>
          </div>

          <div class="f-group g-col as--1_2@sm as--1_3@md as--1_4@lg">
            <button type="submit" class="o-button as--success" :disabled="submitted">Add</button>
          </div>
        </form>
        <div class="o-alert as--with-icon as--success" v-show="messageAdded">
                <span class="o-alert__icon">
                 <i class="fa fa-check"></i>
                </span> Feature added!
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  import { mapActions } from 'vuex';
  import featmgtService from '../service/featuremanagement';

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
          name: this.name,
          description: this.description,
        };
      },
    },
    methods: {
      ...mapActions([
        'addFeature',
      ]),
      addFeature2() {
        const app = this;
        app.submitted = true;
        app.messageAdded = false;
        const newFeature = {
          name: this.name,
          description: this.description,
        };
        featmgtService.addFeature(newFeature).then(
          (data) => {
            app.submitted = false;
            app.name = '';
            app.description = '';
            const newfeat = data;
            newfeat.new = true;
            // app.features.unshift(newfeat);
            app.messageAdded = true;
            setTimeout(() => { app.messageAdded = false; }, 1500);
          },
        ).catch();
      },
    },
  };
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
